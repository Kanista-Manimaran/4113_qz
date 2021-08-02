import itertools

DNASeq = ["tagtggtcttttgagtgtagatctgaagggaaagtatttccaccagttcggggtcacccagcagggcagggtgacttaat",
          "cgcgactcggcgctcacagttatcgcacgtttagaccaaaacggagttgGgatccgaaactggagtttaatcggagtcctt",
          "gttacttgtgagcctggttagacccgaaatataattgttggctgcatagcggagctgacatacgagtaggggaaatgcgt",
          "aacatcaggctttgattaaacaatttaagcacgtaaatccgaattgacctgatgacaatacggaacatgccggctccggg",
          "accaccggataggctgcttattaggtccaaaaggtagtatcgtaataatggctcagccatgtcaatgtgcggcattccac"]


t = 5
n = 80
l = 10

def score(DNASeq,s):
    basicdna = ['a', 't', 'g', 'c']
    mylist = []
    z = 0
    for dna in DNASeq:
        temp = []
        for w in dna[s[z]:s[z] + l]:
            temp.append(w)

        z += 1
        mylist.append(temp)
    i = 0
    f = []

    i1 = 0
    while i1 < len(basicdna):
        j1 = 0
        arr = []
        while j1 < l:
            arr.append(0)
            j1 += 1
        f.append(arr)
        i1 += 1
    while i < len(basicdna):
        j = 0
        while j < l:
            k = 0
            while k < t:
                if basicdna[i] ==mylist[k][j]:
                    f[i][j] += 1
                k += 1
            j += 1
        i += 1

        x = 0
        sum = 0
        while x < l:
            y = 0
            max = 0
            while y < len(f):
                if f[y][x] > max:
                    max = f[y][x]
                y += 1
            sum += max
            x += 1
    return sum



def bruteForce(DNASeq,t,n,l):
    data = itertools.product(range(n-l),repeat=t)
    finalScore = 0
    finalMotif = []
    for s in data:
        scoretemp = score(DNASeq,s)
        if scoretemp >finalScore:
            finalMotif = s
            finalScore = scoretemp

    print(finalScore)
    print(finalMotif)

    return finalMotif


bruteForce(DNASeq,t,n,l)







































