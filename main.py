import os
import sys
#per aprire il file


def get_percorso():
    #passare il percorso del file
    tmp = input("$:" )
    os.chdir(tmp)
    print("dir : ")
    print(os.getcwd())
    #return percorso

def get_tree():
    os.system("tree /A")
    
def get_lista_cartelle():
    lista = os.listdir()
    print(lista)

    print("scegliere per nome o per numero? ")
    scelta = input()

    if (scelta == "nome"):
        print("scegli la cartella da aprire nella lista qui sopra elencata : ")
        nome_cartella = input()
        return nome_cartella

    elif(scelta == "numero"):
        print("scegli la cartella da aprire nella lista qui sopra elencata : ")
        numero_file_lista = input()
        obj = lista.pop(int(numero_file_lista))
        print(obj)
        return obj
    else:
        return 1
#    print("scegli cartella da aprire nella lista qui sopra elencata : ")
#    numero_file_lista = input()
#    obj = lista.pop(int(numero_file_lista))
#    print(obj)
#    return obj

def open_file(file_da_aprire):
    file = file_da_aprire
    print("funzione : ",file)
    try:
        print("start ",os.system(file))
    except:
        print("Error: non trovo il percorso !")

def crea_dir():
    creadir = input("nome nuova directory: "  )
    os.mkdir(creadir)



if __name__ == '__main__':
        i = 0
        while i == 0:
            get_percorso()
            get_tree()
            file_da_aprire = get_lista_cartelle()
            open_file(file_da_aprire)

#get_percorso()
#get_tree()
#crea_dir()
#file_da_aprire = get_lista_cartelle()
#open_file(file_da_aprire)

