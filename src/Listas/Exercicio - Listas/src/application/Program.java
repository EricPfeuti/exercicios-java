package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Employee;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        // LÓGICA para INSERIR NOVO FUNCIONÁRIO
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();

            System.out.println("Employee #" + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();

            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        // LÓGICA para ENCONTRAR ID do funcionário
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist! ");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // APARECER LISTA dos FUNCIONÁRIOS
        System.out.println();
        System.out.println("List of employees:");
        for (Employee x : employees) {
            System.out.println(x);
        }

        sc.close();
    }
}
