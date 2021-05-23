package P1;
import java.io.IOException;
/*import java.nio.file.Files;
import java.nio.file.Paths; 
import java.io.BufferedReader;*/
import java.io.File;
import java.io.FileNotFoundException;
/*import java.io.FileReader;*/
import java.util.Scanner;


public List<name>name = new ArrayList<name>();
public Set<String>relationship = new HashSet<String>();


public class MagicSquare {
	public static void main(String[] args) throws IOException{
		 String filename1 ="C:\\\\Users\\\\徐涵知\\\\Desktop\\\\软件构造\\\\实验\\\\1\\\\Spring2021_HITCS_SC_Lab1-master\\\\P1\\\\1.txt";
		 String filename2 ="C:\\\\Users\\\\徐涵知\\\\Desktop\\\\软件构造\\\\实验\\\\1\\\\Spring2021_HITCS_SC_Lab1-master\\\\P1\\\\2.txt";
		 String filename3 ="C:\\\\Users\\\\徐涵知\\\\Desktop\\\\软件构造\\\\实验\\\\1\\\\Spring2021_HITCS_SC_Lab1-master\\\\P1\\\\3.txt";
		 String filename4 ="C:\\\\Users\\\\徐涵知\\\\Desktop\\\\软件构造\\\\实验\\\\1\\\\Spring2021_HITCS_SC_Lab1-master\\\\P1\\\\4.txt";
		 String filename5 ="C:\\\\Users\\\\徐涵知\\\\Desktop\\\\软件构造\\\\实验\\\\1\\\\Spring2021_HITCS_SC_Lab1-master\\\\P1\\\\5.txt";
		 
	
	
	
	

	}
		 

     
     
     static boolean isLegalMagicSquare(double[][] a,int m,int n)//m行，n列
     {
                 int i,j,k,flag=1;
                 double sum[]= new double[m+n];
                 double sum1=0;
                 for(i=0;i<m;i++)
                 {
                        for(j=0;j<n;j++)
                        {
                             
                              sum1=sum1+a[i][j];
                        }
                        sum[i]=sum1;
                 }    
                for(j=0;j<n;j++)
                 {
                        for(i=0;i<m;i++)
                        {
                               
                              sum1=sum1+a[i][j];
                        }
                        sum[m+j]=sum1;
                 }      
                for(k=1;k<m+n;k++)
                 {
                        if(sum[k]!=sum[k-1])
                        {
                                 flag=0;
                        }
                 }          
                if(flag==0)
                {
                        System.out.println("wrong"); 
                }
                 if(flag==1)
                {
                        System.out.println("true"); 
                }
                 return true;
      }
    public static double[][] readFile(String filename,int n) {
         double[][] arr = new double[n][n];

         try {
             File file = new File(filename);
             Scanner scanner = new Scanner(file);
             while (scanner.hasNextLine()) {
                 for (int i = 0; i < arr.length; i++) {
                     String[] line = scanner.nextLine().split("\t");
                     for (int j = 0; j < line.length; j++) {
                         arr[i][j] = Integer.parseInt(line[j]);
                     }
                 }

             }
             scanner.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         return arr;
     }

     

}
