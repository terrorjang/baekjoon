//
//  1325.cpp
//  cpp
//
//  Created by 장영석 on 2023/06/29.
//

#include <iostream>
#include <vector>

using namespace std;

const int MAX = 10001;

int N, M, num = 0;
bool visited[MAX];
vector<int> arr[MAX];

void DFS(int x) {
    visited[x] = true;
    
    for(int n: arr[x]) {
        if (visited[n] == false) {
            num++;
            DFS(n);
        }
    }
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    cin >> N >> M;
    
   
    
    for(int i = 0; i < M; i++) {
        int num1, num2;
        cin >> num1 >> num2;
        
        arr[num2].push_back(num1);
    }
    
    vector<int> answer;
    int max_count = 0;
    
    for(int i = 1; i<= N; i++) {
        memset(visited, false, sizeof(visited));
        
        num = 0;
        DFS(i);
        
        if (max_count < num) {
            max_count = num;
            answer.clear();
            answer.push_back(i);
        } else if(max_count == num) {
            answer.push_back(i);
        }
    }
    
    for(int n:answer) {
        cout << n << ' ';
    }
}
