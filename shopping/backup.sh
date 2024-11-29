#!/bin/bash

DATE=$(date +'%Y%m%d%H%M%S')

BACKUP_DIR="/var/backups"

BD_NAME="products"

BACKUP_FILENAME="$BACKUP_DIR/$BD_NAME-$DATE.sql"

mysqldump $BD_NAME > $BACKUP_FILENAME
echo "$(date) - backup de la bd realizado." >> /proc/1/fd/1