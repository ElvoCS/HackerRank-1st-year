if __name__ == '__main__':
    N = int(input())
    list=[]


    for _ in range(N):
        cmd=(input().split())
        
        if cmd[0]=='insert':
            list.insert(int(cmd[1]),int(cmd[2]))
        elif cmd[0]=="remove":
            list.remove(int(cmd[1]))
        elif cmd[0]=="append":
            list.append(int(cmd[1]))
        elif cmd[0]=="sort":
            list.sort()
        elif cmd[0]=="pop":
            list.pop()
        elif cmd[0]=="count":
            v=list.count(int(cmd[1]))
            print(v)
        elif cmd[0]=="reverse":
            list.reverse()
        elif cmd[0]=="index":
            x=list.index(int(cmd[1]))
            print(x)
        elif cmd[0]=="print":
            print(list)

