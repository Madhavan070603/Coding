import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.security.auth.login.FailedLoginException;

class Main{

 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int sum = 10;
    int count = 0;
    for(int i=11;i<=(int) Math.pow(10,n);i++){
      boolean flag = true;
      String s = String.valueOf(i);
      char c = s.charAt(0);
      for(int j= 1;j<s.length();j++){
        if(s.charAt(j) == c){
            flag = true;
        }
        else{
          flag = false;
          break;
        }
      }
      if(flag){
        count++;
      }
    }
  System.out.println((int) Math.pow(10, n)-count);
}
}