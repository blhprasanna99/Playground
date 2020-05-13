#include<iostream>
using namespace std;
int main()
{
  int n,i,a[20],e=0,o=0;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  if(e==n)
    cout<<"\nThe array is Even";
  else if(o==n)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";//Type your code here.
}