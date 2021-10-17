#include<iostream>
using namespace std;
int main(){
    int a,b,c,n,num;
    cout<<"Enter value of a,b\n";
    cin>>a>>b;
    cout<<"Enter your choice \n";
    cout<<"1.Add\n2.Sub\n3.Mul\n4.Div\n5.Fact";
    cin>>n;
    switch (n)
    {
    case 1:c=a+b;
           cout<<c;
           break;
    case 2:c=a-b;
          cout<<c;
          break;
    case 3:c=a*b;
           cout<<c;
           break;
    case 4:c=a/b;
          cout<<c;
          break;
    case 5: cout<<"Enter a number";
            cin>>num;
            c=1;
            for(int i=1;i<=num;i++){
                c*=i; 
            }
            cout<<"Factorial of "<<num<< " is "<<c;
            break;
    default:cout<<"Invalid option";
        break;
    }
    return 0;
}