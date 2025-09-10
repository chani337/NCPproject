#!/bin/bash

# --- Private �꽌踰� �젙蹂� ---
PRIVATE_HOST="10.10.100.6"          # �떎�젣 Private �꽌踰� IP
PRIVATE_USER="root"                 # Private �꽌踰� 怨꾩젙
PRIVATE_KEY="/root/.ssh/id_rsa"     # Public �꽌踰꾩뿉�꽌 Private �꽌踰� �젒�냽�슜 �궎

# --- �떎�뻾 �썑 濡쒓렇 �궓湲곌린 ---
exec > /root/app/deploy_private.log 2>&1
echo "Starting deployment to Private server..."


eval $(ssh-agent -s)
ssh-add $PRIVATE_KEY


ssh -o StrictHostKeyChecking=no $PRIVATE_USER@$PRIVATE_HOST "mkdir -p /root/app"


scp -o StrictHostKeyChecking=no /root/app/build/libs/*.jar $PRIVATE_USER@$PRIVATE_HOST:/root/app/app.jar


ssh -o StrictHostKeyChecking=no $PRIVATE_USER@$PRIVATE_HOST "nohup java -jar /root/app/app.jar > /root/app/app.log 2>&1 &"

ssh -o StrictHostKeyChecking=no $PRIVATE_USER@$PRIVATE_HOST "bash </root/deploy.sh"

ssh-agent -k

echo "Deployment to Private server completed."