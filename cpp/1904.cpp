//
//  1904.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/26.
//

#include <iostream>


using namespace std;

int main() {
    int N;
    cin >> N;
    
    int dp[1000001];
    
    dp[1] = 1;
    dp[2] = 2;
    
    for(int i = 3; i <= N; i++) {
        dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
    }
    
    cout << dp[N];
    
    
}
