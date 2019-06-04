#include <bits/stdc++.h>

using namespace std;

string CK(string a, string b){
    char ck = a[0];
    string ans = "";
    ans+=ck;
    char ch = b[0];
    for(int i = 1 ; i < a.length(); i++ ){
        if((int)a[i] < (int)ch){
            ans += a[i];
        }
        else{
            return ans;
        }
    }
    return ans;
}
// Complete the morganAndString function below.
string morganAndString(string q, string w) {
    q+="z";
    w+="z";
    int l = 0;
    int k = 0;
    string x = "";
    while(k < q.length() && l < w.length()){
        if((int)q[k] < (int)w[l]){
            if(q[k]!='z')
                x += q[k];
            k++;
        }
        else if((int)q[k] > (int)w[l]){
            if(w[l]!='z')
                x += w[l];
            l++;
        }
        else{
            string a = q.substr(k);
            string b = w.substr(l);
            // cout<<a<<" "<<b; 
            if( a < b){
                // string check = CK(a,b);
                // for(int i = 0 ; i < check.length(); i++){
                char ck = q[k];
                while(q[k] == ck){
                    if(q[k]!='z') 
                        x += q[k];
                    k++;
                }
                // }
            }
            else{
                // string check = CK(b,a);
                //                 cout<<checkendl;
                // for(int i = 0 ; i < check.length(); i++){
                char ck = w[l];
                while(ck == w[l]){
                    if(w[l]!='z') 
                        x += w[l];
                    l++;
                }
                // }
            }
        }
    }
    while(k < q.length()){
        if(q[k]!='z')
            x += q[k];
        k++;
    }
    while(l < w.length()){ 
        if(w[l]!='z')
            x += w[l];
        l++;
    }
    // cout<<x;
    return x;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string a;
        getline(cin, a);

        string b;
        getline(cin, b);

        string result = morganAndString(a, b);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
