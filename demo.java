



public class demo {
  static void prime_n(int n){
    int x,y,z;
    System.out.println("All the prime numbers within 1 and "+ n +" are: ");

    for (x=1;x<=n;x++){
      if(x==1 ||(x==0)){
        continue;
      }
      z=1;
      for(y=2;y<=x/2;++y){
        if(x%y==0){
          z=0;
          break;
        }
      }
      if(z==1){
        System.out.println(x+" ");
      }

    }
  }
  public static void main (String a[])
  {
    int N=45;
    prime_n(N);
     

    }
  }


    
   
