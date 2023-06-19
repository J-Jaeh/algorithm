import java.util.*;
//알고리즘은 아니고... 좌표 문제가 나온다면 써먹을 정렬쯤된다
class Point implements  Comparable<Point>// 포인트 인스턴스를 정렬하는!!{
    public int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return  this.y-o.y;  //오름차순을 정렬하려면 .. this-o 가 음수가 되어야한다 ..!(앞이 this 뒤가 o 기준)
        else return this.x-o.x;   //암기..!
    }
}

class Main{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();// 좌표의갯수
        ArrayList<Point> arr = new ArrayList<>;
        for(int i=0; i<n;i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr); // Comparable 을 통해서 정렬을 하는데 이때 Override 된 기준으로 정렬을 한다 ..!

        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}