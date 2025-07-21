public class Cookies{
    public static void main(String[] args){
    double [][]cookieSales = {{4559.49,8860.30,2291.90,8550.84},
                          {7946.93,9703.66,9924.06,531.69},
                          {5027.48,8050.74,3715.77,9573.72},
                          {866.44,2310.67,2749.98,3747.57},
                          {5133.77,1812.53,2690.81,399.51}};
 
    for(int i = 0; i < 5; i++){
    for(int j = 0; j < 4; j++){
    System.out.print(cookieSales[i][j]+ " ");
    }
    System.out.println();
    }
     double sum = 0.0; 
     for(int row = 0; row < cookieSales.length; row++){
          for(int col = 0; col < cookieSales[0].length; col++){
             sum += cookieSales[row][col];//keeping track of total   (also coudlve done) 
                                          //sum = sum + cookieSales[row][col];
                                          //%,.2f%n print sum with comma and after decimal place
                                          //%n= new line   f=floating point value
            
            }
         }
           System.out.printf("The total over 2021: $%,.2f%n", sum);
           
           
            
         
          for(int col = 0; col < cookieSales[0].length; col++){
          double totalCookies= 0; 
           for(int row = 0; row < cookieSales.length; row++){

           totalCookies += cookieSales[row][col];           
            }
            System.out.printf("Total sales for cookie #%d: $%,.2f%n",(col+1), totalCookies);
                                           //%d = place ho,der for integer 
       }
//EXTRA STUFF
//display cookie name from 1d array when printing cookie total
   String[] cookies= {"Tagalongs", "Trefoils","Thin Mints","Samoas"};
 for(int col = 0; col < cookieSales[0].length; col++){
          double totalCookies= 0; 
           for(int row = 0; row < cookieSales.length; row++){

           totalCookies += cookieSales[row][col];           
            }
            System.out.printf("Total sales for %s: $%,.2f%n", cookies[col], totalCookies);
                                          //%s = place holder for String
// display average per scout
   /*String[] scouts ={"Jet","Dana","Ayanna","Olvia","Densie"};
   for(int row = 0; row < cookieSales.length; row++){
   double scoutTotal=0;
          for(int col = 0; col < cookieSales[0].length; col++){
             scoutTotal += cookieSales[row][col];
             double average=scoutTotal/totalCookies[0].length;
       System.out.printf("Average sales for %s: $%,.2f%n", scouts[row],average);     
       }  
}*/
}
}
}
