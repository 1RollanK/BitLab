public class Main {
    public static void main(String[] args) {
        // Создаем объекты рабочих
        Staff staff1 = new Staff(1, "John", "Doe", 5000);
        Staff staff2 = new Staff(2, "Jane", "Smith", 7000);
        Staff staff3 = new Staff(3, "Bob", "Johnson", 4000);
        Staff staff4 = new Staff(4, "Alice", "Lee", 5500);
        Staff staff5 = new Staff(5, "Mark", "Brown", 6000);

        // Создаем объекты отдела кадров
        HRManagers hrManager1 = new HRManagers(6, "Samantha Green", 8000);
        HRManagers hrManager2 = new HRManagers(7, "Michael Black", 7500);
        HRManagers hrManager3 = new HRManagers(8, "Emily White", 9000);
        HRManagers hrManager4 = new HRManagers(9, "Daniel Lee", 8200);
        HRManagers hrManager5 = new HRManagers(10, "Olivia Davis", 7800);

        // Создаем объекты программистов
        Programmers programmer1 = new Programmers(11, "dev1", 7000, 2000, 0.8);
        Programmers programmer2 = new Programmers(12, "dev2", 7500, 1800, 1.0);
        Programmers programmer3 = new Programmers(13, "dev3", 6500, 2500, 0.6);
        Programmers programmer4 = new Programmers(14, "dev4", 7200, 2200, 0.9);
        Programmers programmer5 = new Programmers(15, "dev5", 6800, 1900, 0.7);

        // Найти рабочего с самой высокой зарплатой
        Workers highestPaidWorker = null;
        int maxSalary = Integer.MIN_VALUE;

        Workers[] workers = {staff1, staff2, staff3, staff4, staff5, hrManager1, hrManager2, hrManager3, hrManager4, hrManager5, programmer1, programmer2, programmer3, programmer4, programmer5};

        for (Workers worker : workers) {
            if (worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
                highestPaidWorker = worker;
            }
        }

        System.out.println("Worker with highest salary:");
        System.out.println(highestPaidWorker.getWorkerData());
        System.out.println("Salary: " + highestPaidWorker.getSalary());
        System.out.println();


// Сортируем массив по зарплате
        for (int i = 0; i < workers.length - 1; i++) {
            for (int j = i + 1; j < workers.length; j++) {
                if (workers[i].getSalary() < workers[j].getSalary()) {
                    Workers temp = workers[i];
                    workers[i] = workers[j];
                    workers[j] = temp;
                }
            }
        }

// Выводим информацию о сотрудниках в порядке убывания зарплаты
        for (Workers worker : workers) {
            System.out.println(worker.getWorkerData());
            System.out.println(worker.getSalary());

        }
    }
}