import java.util.*;

//이분 검색의 시간복잡도는 logN ! 순차보다 좋다
class Main{
    public int solution(int n, int m, int[] arr){
        int answer = 0;

        Arrays.sort(arr);
        int lt=0 ,rt=n-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1; // 아마 정렬 했을때 몇번째에 존재하는지 알려주는게 answer인듯
                break;
            }
            if(arr[mid]>m) rt=mid-1; // 아 이건.. 찾아야하는 값이 더작으니까 ..! rt를 mid값으로..!
            else lt=mid+1;
        }
        return answer;
    }

}