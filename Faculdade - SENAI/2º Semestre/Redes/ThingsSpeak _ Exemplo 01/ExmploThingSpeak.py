import urllib.request
import requests
import time

CHAVE = "H1O1FD03B6OQXPEW"
URL = " https://api.thingspeak.com/update?api_key=H1O1FD03B6OQXPEW&field1=%s"%CHAVE
x=0

while x<5:
    valor = int(input('Entre com o valor'))
    resposta = urllib.request.urlopen(URL + "&field1=%s" % (valor))
    print(resposta.read())
    resposta.close()
    x=x+1 
    time.sleep(15.0)
