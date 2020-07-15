n=int(input())
a={}
for i in  range(n):
    s=input().split()
    a[s[0]]=[float(x) for x in s[1:]]
q=input()
print("%.2f" % (sum(a[q])/len(a[q])))
