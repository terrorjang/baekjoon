//
//  23827.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/28.
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
//    vector<int> sum(N);
    
    long long total = 0;
    for(int i = 0; i < N; i++) {
        cin >> arr[i];
        total += arr[i];
    }
    
    long long answer = 0;
    
    for(int n: arr) {
        total -= n;
        answer += (n * total) % 1000000007;
    }
    
    cout<< answer;
    
    
//    sum[N - 1] = arr[0];
//
//    for(int i = 1; i < N;  i++) {
//        sum[N - i - 1] = sum[N - i] + arr[i];
//    }
    
    
}
