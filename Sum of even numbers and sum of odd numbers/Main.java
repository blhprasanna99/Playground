#include<iostream>
using namespace std;
int main()
{
  int n,i,oc=0,ec=0,a[15];
  cin>>n;
  for (i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      ec=ec+a[i];
    else
      oc=oc+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<ec;
  cout<<"\nThe sum of the odd numbers in the array is "<<oc;//Type your code here.
}