package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");

    int n = sc.nextInt();
    Bazaar b = new Bazaar();
    for (int i = 0; i<n; i++){
        System.out.println("Enter the policy ID");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Policy Name");
        String name = sc.nextLine();
        b.addPolicyDetails(pid, name);
    }
    
    for (Map.Entry<Integer, String> e : b.getPolicyMap().entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());    
    }
    System.out.println("Enter the policy type to be searched");
    String key = sc.next();
    List<Integer> policies=b.searchBasedOnPolicyType(key);
    for(Integer p:policies){
        System.out.println(p);
    }    

	}

}
