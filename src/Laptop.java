public class Laptop implements Runnable {
    int num;
    String[] processes = {"System startup", "Initializing BIOS...", "Loading Bootloader...", "Loading OS...", "Desktop loaded"};

    Laptop(int num){
        this.num = num - 1;
    }

    public void run(){
        System.out.println(processes[num]);
    }
}
