package _Challenges.TimBuchalka.VadiaChallenges.AbstractClassChallenge;

public class AbstractChallenge
{
    public static void main(String[] args) {
MyLInkedList list=new MyLInkedList(null);
list.traverse(list.getRoot());

String stringData="KUsh v likhdo koi chakar nhi";
String[] data=stringData.split(" ");
for (String s :data)
{
    list.addItem(new Node(s));

}
list.traverse(list.getRoot());
    }
}
