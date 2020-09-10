
#include <bits/stdc++.h>
using namespace std;

std::vector<std::string> string_split(const std::string &s, const string &delimiter=" "){
    std::vector<std::string> tokens;
    std::string token;
    size_t pos = 0, prev = 0, delim_length = delimiter.length();
    while ((pos = s.find(delimiter, pos)) != std::string::npos){
        token = s.substr(prev, pos - prev);
        // if(!token.empty()){
            tokens.push_back(token);
        // }
        prev = pos += delim_length;
    }
    tokens.push_back(s.substr(prev, pos));
    return tokens;
}

int main() {
    // #ifndef TESTING
    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);
    // #endif
    
    int cases;
    cin >> cases;
    while(cases--){
        string input;
        cin >> input;
        auto split = string_split(input, ",");
        int base = split.size();
        unsigned long long converted = 0;
        for(auto it = split.begin(); it != split.end(); it++){
            int toi;
            try{
                toi = stoi(*it);
            } catch(invalid_argument e){
                toi = 0;
            }
            // cout << toi <<  " " << endl;
            converted += toi * pow(60, --base);
        }
        // cout << endl;
        cout << converted << endl;
    }
    
    return 0;
}
