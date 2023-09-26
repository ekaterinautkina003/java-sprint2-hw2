import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        System.out.println("Выберите одно из действий: ");
        System.out.println("1 - Считать все месячные отчёты.");
        System.out.println("2 - Считать годовой отчёт.");
        System.out.println("3 - Сверить отчёты.");
        System.out.println("4 - Вывести информацию обо всех месячных отчётах.");
        System.out.println("5 - Вывести информацию о годовом отчёте.");
        System.out.println("6 - Выход.");

        Scanner scanner = new Scanner(System.in);
        List<String> fileNames = new ReaderName().getName();
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport();


        while (true) {
            int command = scanner.nextInt();
            if (command == 1) {
                for (String filterFileName : filterFileNames(fileNames, "m")) {
                    monthlyReport.loadReport(filterFileName);
                }
                monthlyReport.printReadMonths();

            }
            else if (command == 2) {
                for (String filterFileName : filterFileNames(fileNames, "y")) {
                    yearlyReport.loadReport(filterFileName);
                }
                yearlyReport.printReadYears();


            }
            else if (command == 3) {
                ReportEngine reportEngine = new ReportEngine(monthlyReport, yearlyReport);


            }
            else if (command == 4) {
                monthlyReport.report();


            }
            else if (command == 5) {
                yearlyReport.report();


            }
            else if (command == 6) {
                System.out.println("Программа завершена.");
                break;

            }
            else  {
                System.out.println("Извините, такой команды пока нет.");
                System.out.println();
                System.out.println("Выберите одно из действий: ");
                System.out.println("1 - Считать все месячные отчёты.");
                System.out.println("2 - Считать годовой отчёт.");
                System.out.println("3 - Сверить отчёты.");
                System.out.println("4 - Вывести информацию обо всех месячных отчётах.");
                System.out.println("5 - Вывести информацию о годовом отчёте.");
                System.out.println("6 - Выход.");
            }
        }
    }

    private static List<String> filterFileNames(List<String> fileNames, String elem) {
        return fileNames.stream().filter(e -> e.contains(elem)).collect(Collectors.toList());
    }
}