package edu.tamu.cs;

import java.util.Scanner;

public class AutoPolicyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

        input.close();
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.printf("The auto policy:\n");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state\n\n",
            policy.getAccountNumber(), policy.getMakeAndModel(),
            policy.getState(),
            (policy.isNoFaultState()) ? "is": "is not");
    }
}