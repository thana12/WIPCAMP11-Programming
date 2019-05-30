/*
 * WIP XI Computer Programing 
 */

package V.Selection;

/**
 *
 * @author sittiwatlcp
 */
public class Selection {
    public static void main(String[] args) {
        boolean ตื่นสาย = true;
        boolean มีเงินค่ารถ = false;
        boolean เดินไปโรงเรียนทัน = false;
        
        if(ตื่นสาย){
            System.out.println("ตื่นสาย!");
            if(เดินไปโรงเรียนทัน){
                System.out.println("เดินไปเรียน");
                System.out.println("ถึงโรงเรียนทันเวลา");
                System.out.println("--= จบ =--");
            } else {
                if(มีเงินค่ารถ){
                    System.out.println("นั่งรถเรียน");
                    System.out.println("ถึงโรงเรียนทันเวลา");
                    System.out.println("--= จบ =--");
                } else {
                    System.out.println("เดินไปเรียน");
                    System.out.println("ถึงโรงเรียนสาย");
                    System.out.println("--= จบ =--");
                }
            }
        } else {
            System.out.println("เดินไปเรียน");
            System.out.println("ถึงโรงเรียนทันเวลา");
            System.out.println("--= จบ =--");
        }
        
    }
}
