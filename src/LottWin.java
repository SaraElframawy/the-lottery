public class LottWin implements Comparable<LottWin> {
        String vinst;
        int nr;
public int compareTo (LottWin annan){
    return nr - annan.nr;
}

    }