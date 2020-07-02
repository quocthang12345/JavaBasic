package Java_basic;

public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Float.TYPE, Float.BYTES, Float.MIN_VALUE, Float.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Double.TYPE, Double.BYTES, Double.MIN_VALUE, Double.MIN_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Character.TYPE, Character.BYTES, Character.MIN_VALUE, Character.MIN_VALUE);
    }
}

