
#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int N, M;
    cin >> N >> M;
    
    vector<int> A(N);
     
    
    int left = 0, right = 0, mid = 0;
    for(int i = 0; i < N; i++) {
        cin>>A[i];
        if(left < A[i])
            left = A[i];
        
        right += A[i];
    }
    
    
    
    int count = 0, sum = 0, answer = 0;
    while (left <= right) {
        count = 1;
        sum = 0;
        mid = (left + right) / 2;
        
        for(int num : A) {
            if(num > mid) {
                count = N + 1;
                break;
            }
            sum += num;
            if(sum > mid) {
                count ++;
                sum = num;
            }
        }
        
        if(count <= M) {
            right = mid - 1;
            answer = mid;
        }
        else {
            left = mid + 1;
        }
    }
    
    cout << answer;
}
