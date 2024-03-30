import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Daftar Tugas");
            System.out.println("4. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul tugas: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan deskripsi tugas: ");
                    String description = scanner.nextLine();
                    Task task = new Task(title, description);
                    taskList.addTask(task);
                    System.out.println("Tugas berhasil ditambahkan.");
                    break;
                case 2:
                    // Logika untuk menghapus tugas
                    break;
                case 3:
                    System.out.println("Daftar Tugas:");
                    taskList.displayTasks();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
