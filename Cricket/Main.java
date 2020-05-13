#include<iostream>
using namespace std;
int main()
{
  int tb,x,y,n,oa;
  float of,crr,trr;
  cin>>tb>>x>>y>>n;
  oa=(tb/6);
  trr=(float)x/oa;
  of=((float)(n/6))+((n%6)*0.1);
  crr=(float)y/of;
  cout<<oa<<'\n'<<of<<'\n';
  printf("%0.1f\n%0.1f\n",crr,trr);
  if(crr>trr)
  {
    cout<<"Eligible to Win";
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
}