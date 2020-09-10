#include <bits/stdc++.h>

using namespace std;

int find(vector<int>& b, int c) {
    if(b[c] == -1) return c;
    return b[c] = find(b,b[c]);
}

void join(vector<int>& b, int c, int d) {
    c = find(b,c);
    d = find(b,d);
    if(c == d) return;
    b[c] = d;
}

int main() {
    string s;
    cin >> s;

    int n = s.size();

    int k;
    cin >> k;

    vector<int> b(n,-1);

    for(int i = 0; i < n; i++) {
        for(int j = i+1; j < n; j++) {
            if(j-i >= k) {
                join(b,j,i);
            }
        }
    }

    vector<deque<char>> chars(n);

    for(int i = 0; i < n; i++) {
        chars[find(b,i)].push_back(s[i]);
    }

    for(auto& i : chars) {
        sort(i.begin(),i.end());
    }

    string res;
    for(int i = 0; i < n; i++) {
        res.push_back(chars[find(b,i)].front());
        chars[find(b,i)].pop_front();
    }
        
    sort(s.begin(),s.end());

    if(s == res) {
        cout << "Yes" << endl;
    }
    else {
        cout << "No" << endl;
    }
}
