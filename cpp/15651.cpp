//
//  15651.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/24.
//

#include <iostream>
#include <vector>

using namespace std;
int arr[7];

void solution(int d, int n, int m) {
    if(d == m) {
        for(int i = 0; i< m; i ++){
            cout << arr[i] << ' ';
        }
        cout<< '\n';
        return;
    }
    
    for(int i = 0; i < n; i ++) {
        arr[d] = i + 1;
        solution(d + 1, n, m);
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int N, M;
    
    cin >> N >> M;
    
    
    solution(0, N, M);
}
