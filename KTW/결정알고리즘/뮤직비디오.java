import java.util.*;
//결정알고리즘... 이분검색을 이용하는 방법이랄까??!
// 1. 문제에서 요구하는답이  lt rt 사이에 있다는 확신이 있을때 결정알고리즘을 써라~
// 2.  ~~가 이문제의 답이 가능하냐 안하냐~~ 판단하면서 좁혀가기 ..
// 3. 정렬이 되어있어야하지~
// 3. 답의 가능성 최소값과 최대값 구하기 ..


class Main{
    public int count(int[] arr, int capacity){
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }else sum+=x;
        }
        return cnt;
    }

    public int solution(int n , int m, int[] arr){
        int answer =0;
        int lt = Arrays.stream(arr).max().getAsInt();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }else lt =mid+1;
        }
        return answer;
    }
}