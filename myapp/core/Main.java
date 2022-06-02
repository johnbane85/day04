package myapp.core;

import java.util.*;


public class Main {
  public static void main(String[] args) {

    List<String> names = new LinkedList<>();
    names.add("fred");
    names.add("barney");
    names.add("wilma");
    names.add("betty");

    // BankAccount fred = new BankAccount("fred");
    // BankAccount barney = new BankAccount("barney");
    // BankAccount wilma = new BankAccount("wilma");
    // BankAccount betty = new BankAccount("betty");


    // Create a simple Map
    Map<String, BankAccount> accts = new HashMap<>();
    // accts.put(fred.getAccountId(), fred);
    // accts.put(barney.getAccountId(), barney);
    // accts.put(wilma.getAccountId(), wilma);
    // accts.put(betty.getAccountId(), betty);

    for (String n: names) {
      BankAccount acct = new BankAccount(n);
      accts.put(acct.getAccountId(), acct);
    }


    System.out.printf("size: %d\n", accts.size());
    //System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));
    System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

    Set<String> keys = accts.keySet();
    Collection<BankAccount> values = accts.values();

    BankAccount acct;
    for (String acctId: keys) {
      acct = accts.get(acctId);
      System.out.printf("acctid = %s, name = %s\n", acctId, acct.getName());
    }
  }
}
