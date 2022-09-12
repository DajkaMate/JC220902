/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01;

/**
 *
 * @author user08
 */
public class J01 {  
    

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
    
    /*
    összegzés
        int[] tomb = {1, 2, 3, 4, 5};
        
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++)
            osszeg = osszeg + tomb[i];
        
        System.out.println(osszeg);       
    }
    */
   
    /*
    megszamlalas
        int[] tomb = {1, 2, 3, 4, 5};
        int szamlalo = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i]>5)
                szamlalo++;
            
        System.out.println(szamlalo);
    }
    */
    
    
    
    //eldöntés
        int[] tomb = {1, 2, 3, 4, 5};
        int keres = 2;
    
        int i = 0;
        while(i < tomb.length && tomb[i] != keres)
            i++;
        if (i < n)
            System.out.println("Van ilyen szám.");
		else
            System.out.println("Nincs ilyen szám.");
    }
    
    
    /*
    kiválaszás
        int[] tomb = {1, 2, 3, 4, 5};
        int keres = 2;
        int i = 0;
        while(tomb[i] != keres)
            i++;
        
        System.out.printf("%d\n",i + 1);
    }
    */

    /*keresés
    int[] tomb = {1, 2, 3, 4, 5};
    int n = 5;
    int keres = 2;
    
    int i = 0;
    while( i < n && tomb[i] !=keres)
        i++;
    if (i<n) 
    {
        System.out.printf("Van ilyen a következő helyen: %d\n", i + 1); 		
    }
        else 
    {
        System.out.println("Nincs ilyen elem");
    } 
    }
    */
    
    
    /*kiválogatás
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[a.lenght];
    int j = 0;
        for (int i = 0; i < a.lenght; i++)
        {
            if (a[i] > 5)
            {
                b[j++] = a[i];
            }  
        }
        
        int m = j;
        
        for(int i=0; i<n;i++)
        {
            System.out.print(a[i] + " ");
            System.out.println();
        }
			
        for(int i=0; i<m;i++) 
        {
            System.out.print(b[i] + " ");
            System.out.println();
        }
    */
    
    /*szétválogatás
    int[] a = {1, 2, 3, 4, 5};
    int n = 5; 
    int[] b = new int[n];
    int[] c = new int[n];
 
    int j=0;
    int k=0;
    for(int i=0; i<n;i++)
			if(a[i] > 5)
				b[j++] = a[i];
			else
				c[k++] = a[i];
 
		int m = j; //A "b" tömb elemeinek száma
		int l = k; //A "c" tömb elemeinek száma
 
		//Első tömb kiíratva:
		for(int i=0; i<n;i++)
			System.out.print(a[i] + " ");
		System.out.println();
 
		//Második tömb kiíratva:
		for(int i=0; i<m;i++)
			System.out.print(b[i] + " ");
		System.out.println();
 
		//Harmadik tömb kiíratva:
		for(int i=0; i<l;i++)
			System.out.print(c[i] + " ");
		System.out.println();
    }
    */
    
    /*maximum
    int[] tomb = {1, 2, 3, 4, 5};
    int n = 5;
    int max = tomb[0];
    
    for(int i=0; i<n;i++)
    {
        if(tomb[i] > max)
	max = tomb[i];
    }
    System.out.println("Legnagyobb: " + max);		
    }
    */
    
    /*minimum
    int[] tomb = {1, 2, 3, 4, 5};
    int n = 5;
    int min = tomb[0];
    
    for(int i=0; i<n;i++)
    {
        if(tomb[i] < min)
	min = tomb[i];
    }
    System.out.println("Legkisebbb: " + min);		
    }
    }
    */





    
    }

}
        
        
    
    



