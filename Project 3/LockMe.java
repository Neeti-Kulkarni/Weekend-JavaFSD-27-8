
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class LockMe {
	public static void main(String[] args) throws IOException  {
		Scanner sc =new Scanner(System.in);

		while (true)
		{
			System.out.println("Enter\n 1. Display\n 2. Menu\n 3. Exit");
			int i = sc.nextInt();
			String path= "E:\\File\\";


			switch (i) {
				case 1:
					System.out.println("Displaying all files present in path " +path);
					File f=new File(path);
					File  filenames[] = f.listFiles();
					for(File ff: filenames) {
						System.out.println(ff.getName());
					}
					break;
				case 2: 
					boolean x = true;
					while (x) {
						System.out.println("Enter SubMenu\n 1. Add\n 2. Delete\n 3. Search\n 4. Exit ");
						int j=sc.nextInt();
						switch(j) {
							case 1:
								System.out.println("Enter the file to add in the directory of "+path);
								String file=sc.next();
								//File
								File f1=new File(path+file);
								//create a new file
								boolean b1=f1.createNewFile();
								if(b1!=true) {
									System.out.println("File not created in the path "+path);
								}
								else {
									System.out.println("File has been created in the path "+path);
								}
								break;
							case 2: 
								System.out.println("Enter the file to be deleted in the directory of "+path);
								String file2=sc.next();
								//File
								File f2=new File(path+file2);
								//delete a file
								boolean b2=f2.delete();
								if(b2==true) {
									System.out.println("File has been deleted");
								}
								else {
									System.out.println("File is not found / cannot be deleted");
								}
								break;
							case 3:
								System.out.println("Enter the file to be searched in the directory of "+path);
								String file3=sc.next();

								File f3=new File(path);
								File filenames1[]=f3.listFiles();
								int flag=0;
								for(File ff: filenames1) {
									if(ff.getName().equals(file3)) {
										flag=1;
										break;
									}
									else {
										flag=0;
									}
								}


								if(flag==1) {
									System.out.println("The file is found");
								}
								else {
									System.out.println("File is not found");
								}
								break;
							case 4:{
								x = false;
								System.out.println("Exit\n");
								break;
							}
							default:
								System.out.println("Invalid Input");


						}

					}
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");


			}
		}

	}
}

