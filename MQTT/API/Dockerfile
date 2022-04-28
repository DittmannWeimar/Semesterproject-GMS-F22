FROM node:12-alpine

# create root application folder
WORKDIR /app

# copy configs to /app folder
COPY package*.json ./
# copy source code to /app/src folder
COPY src /app/src/

# check files list
RUN ls -a

RUN npm install
RUN npm run build

EXPOSE 80

CMD [ "node", "./dist/index.js" ]