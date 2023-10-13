import java.util.Scanner;
public class polyhedron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of polyhedrons");
        int n=sc.nextInt();
        String [] polyhedrons=new String[n];
        for(int i=0;i<n;i++){
            polyhedrons[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(polyhedrons[i]);
        }
        int faces=0;
        for(int i=0;i<n;i++){
            if(polyhedrons[i]=="Tetrahedron"){
                faces+=4;
            }
            else if(polyhedrons[i]=="Cube"){
                faces+=6;  
            }
            else if(polyhedrons[i]=="Octahedron"){
                faces+=8;  
            }
            else if(polyhedrons[i]=="Dodecahedron"){
                faces+=12;  
            }
            else if(polyhedrons[i]=="Icosahedron"){
                faces+=20;  
            }
        }
        System.out.println(faces);
    }
}
