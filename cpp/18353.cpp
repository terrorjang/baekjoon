//
//  18353.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/27.
//

#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int N;
    cin >> N;
    
    vector<int> arr(N);
    vector<int> dp(N, 1);
    
    for(int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < i; j++) {
            if(arr[i] < arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }
    
    
    int maxN = 0;
    for(int num : dp) {
        maxN = max(maxN, num);
    }
    
    
    cout << N - maxN;
}
