import java.util.*;

class StringBufferOps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println("Capacity: " + sb.capacity());
        System.out.print("Enter a string to insert at start: ");
        sb.insert(0, sc.nextLine());
        System.out.println("After insertion: " + sb);
        System.out.print("Enter string to insert: ");
        String ins = sc.nextLine();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        sc.nextLine(); 

        if (pos >= 0 && pos <= sb.length()) {
            sb.insert(pos, ins);
            System.out.println("After inserting at " + pos + ": " + sb);
        }
        System.out.println("Reversed: " + sb.reverse());
        sb.reverse();
        System.out.print("Enter string to replace: ");
        String rep = sc.nextLine();
        System.out.print("Enter start and end index: ");
        int s = sc.nextInt(), e = sc.nextInt();
        sc.nextLine(); 

        if (s >= 0 && e <= sb.length() && s < e) {
            sb.replace(s, e, rep);
        }
        System.out.println("After replacement: " + sb);
        System.out.print("Enter string to append: ");
        sb.append(sc.nextLine());
        System.out.println("After appending: " + sb);
        sc.close();     }
}
