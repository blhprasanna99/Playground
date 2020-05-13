#include<iostream>
using namespace std;
int main()
{
  int n,s,first,f;
  cin>>n;
  s=(n%10);
  first=n;
  if (n<200) {
    f=0;
  }
  else {
    while(first>=10) {
      first=first/10;
    }
    f=first;
  }
  cout<<(s+f);
}