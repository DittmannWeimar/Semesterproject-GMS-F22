db = new Mongo().getDB("gms");

db.createUser({
    user: 'root',
    pwd: 'toor',
    roles: [
        {
            role: 'readWrite',
            db: 'gms',
        },
    ],
});

db.createCollection('samples', { capped: false })
db.createCollection('triggers', { capped: false })
db.createCollection('alerts', { capped: false })
db.createCollection('errors', { capped: false })
db.createCollection('log', { capped: false })