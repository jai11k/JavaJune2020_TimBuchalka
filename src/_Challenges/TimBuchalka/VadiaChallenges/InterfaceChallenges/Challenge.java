//package _Challenges.TimBuchalka.VadiaChallenges.InterfaceChallenges;
//
//import jdk.internal.module.ModuleInfo;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import static org.graalvm.compiler.hotspot.nodes.aot.LoadConstantIndirectlyNode.loadObject;
//
//public class Challenge
//{
//    public static void main(String[] args)
//    {
//        Player player = new Player("karan"10, 15);
//        System.out.println(player.toString());
//        saveObject(player);
//        player.setHitPoints(8);
//        System.out.println(player);
//        player.setWeapon("RUFLE");
//        saveObject(player);
//        loadObject(player);
//        System.out.println(player);
//
//
//    }
//
//    private static void saveObject(Player player) {
//    }
//
//
//    public static ArrayList<String> readValues(ModuleInfo objectToLoad) {
//        ArrayList<String> values = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose \n" + " 1 to enter a String \n" + " 0 to quit");
//        while (!quit) {
//            System.out.println("Choose a option");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string");
//                    String Stringinput = scanner.nextLine();
//                    values.add(index, Stringinput);
//                    index++;
//                    break;
//            }
//            return values;
//        }
//
//        private static void saveObject (ISavable objectToSave)
//        {
//            for (int i = 0; i < objectToSave.write().size(); i++) {
//                System.out.println("Saving" + objectToSave.write().get(i) + "to storage Device");
//            }
//        }
//        private static void loadObject(ISavable objectToLoad)
//        {
//            ArrayList<String> values = readValues(objectToLoad);
//            objectToLoad.read(values);
//        }
//
//    }
//}
//
