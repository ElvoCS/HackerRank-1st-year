n=int(input())
l=input().split()
l=[int(i)for i in l]
t=tuple(l)
print(hash(t))

