from __future__ import print_function
import mysql.connector
from datetime import datetime

fdate_debut=datetime.now()
fdate_fin=""

cnx = mysql.connector.connect(host="nesztler3227.hopto.org",user="root",password="carolien", database="tlcd_andon")
cursor = cnx.cursor()

add_enregistrement = ("INSERT INTO tlcd "
               "(atelier, machine, famille, date_debut, plage_ouverture, date_fin, statut) "
               "VALUES (%s, %s, %s, %s, %s, %s, %s)")

fatelier = raw_input('Atelier :')
fmachine = raw_input('Machine :')
ffamille = raw_input('Famille :')
fplage_ouverture = raw_input('Plage ouverture :')
fstatut = raw_input('Statut :')
data_enregistrement = (fatelier, fmachine, ffamille, fdate_debut, fplage_ouverture, fdate_fin, fstatut)


cursor.execute(add_enregistrement, data_enregistrement)
id = cursor.lastrowid

cnx.commit()

cursor.close()
cnx.close()