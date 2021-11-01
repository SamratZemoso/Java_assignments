package assignment6;

import java.util.TreeSet;

public class Vampire {

    // count the number of digits present in a number
    public int countDigits(Integer num) {
        int count = 0;
        int tmp_num = num;
        while(tmp_num > 0) {
            tmp_num /= 10;
            count += 1;
        }
        return num != 0 ? count : 1;
    }

    // stores the remainder's count in array
    public void counter(int num, int[] counter) {
        int rem;
        while(num > 0) {
            rem = num % 10;
            counter[rem] += 1;
            num /= 10;
        }
    }

    public boolean checkVampire(int num, int div1, int div2) {

        int[] numCounter = new int[10];
        int[] divCounter = new int[10];

        counter(num, numCounter);
        counter(div1, divCounter);
        counter(div2, divCounter);

        if(div1 % 10 == 0 &&  div2 % 10 == 0)
            return false;

        for(int index = 0; index <= 9; index += 1) {
            if(numCounter[index] != divCounter[index]) {
                return false;
            }
        }
        return true;
    }

    public void vampireNumbers() {

        // Store the vampire numbers in the sorted order
        TreeSet<Integer> vampNum = new TreeSet<>();

        for(int num = 1; vampNum.size() < 100; ++num) {
            for(int divisor1 = 1; divisor1 <= Math.sqrt(num); divisor1++) {
                if(num % divisor1 == 0) {
                    int divisor2 = num / divisor1;
                    int count = countDigits(num);
                    // checking both the divisors contains equal no. of digits
                    if(countDigits(divisor1) == count / 2 && countDigits(divisor2) == count / 2) {
                        if(checkVampire(num, divisor1, divisor2)) {
                            vampNum.add(num);
                            if(vampNum.size() == 100) break;
                        }
                    }
                }
            }
        }
        // print the Vampire numbers
        for(int vamp: vampNum) {
            System.out.println(vamp);
        }
    }

    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        vampire.vampireNumbers();
    }

}

    /*

        output :

        1260
        1395
        1435
        1530
        1827
        2187
        6880
        102510
        104260
        105210
        105264
        105750
        108135
        110758
        115672
        116725
        117067
        118440
        120600
        123354
        124483
        125248
        125433
        125460
        125500
        126027
        126846
        129640
        129775
        131242
        132430
        133245
        134725
        135828
        135837
        136525
        136948
        140350
        145314
        146137
        146952
        150300
        152608
        152685
        153436
        156240
        156289
        156915
        162976
        163944
        172822
        173250
        174370
        175329
        180225
        180297
        182250
        182650
        186624
        190260
        192150
        193257
        193945
        197725
        201852
        205785
        211896
        213466
        215860
        216733
        217638
        218488
        226498
        226872
        229648
        233896
        241564
        245182
        251896
        253750
        254740
        260338
        262984
        263074
        284598
        284760
        286416
        296320
        304717
        312475
        312975
        315594
        315900
        319059
        319536
        326452
        329346
        329656
        336550
        336960

     */
