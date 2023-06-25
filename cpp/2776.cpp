//
//  2776.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/25.
//

#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int T;
    cin >> T;
    
    for(int t = 0; t < T; t ++) {
        int N, M;
        cin >> N;
        
        vector<int> A(N);
        
        for(int i = 0; i < N; i++) {
            cin >> A[i];
        }
        sort(A.begin(), A.end());
        
        cin >> M;
//        vector<int> B(N);
        int num;
        for(int i = 0; i < M; i++) {
            cin >> num;
            int left = 0, right = N -1, mid = 0;
            
            
            while (left <= right) {
                mid = (left + right) / 2;
                if(A[mid] == num) {
                    break;
                }
                
                if (A[mid] > num) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
                
                    
            }
            if(A[mid] == num)
                cout << 1 << '\n';
            else
                cout << 0 << '\n';
            
        }
    }
}
