const mongoose = require('mongoose');
const encryprion = require("../utilities/encryption.js");

let userSchema = mongoose.Schema(
    {
        email : {type: String, required:true, unique:true},
        passwordHash : {type:String, required:true},
        fullName:{type:String, required:true},
        articles:{type:[mongoose.Schema.Types.ObjectId], default:[]},
        salt:{type:String, required:true}
    }
);

userSchema.method({
    authenticate: function (password) {
        let inputPasswordHash = encryprion.hashPassword(password, this.salt);
        let isSamePasswordHash = inputPasswordHash === this.passwordHash;
        return isSamePasswordHash;
    }
});

const User = mongoose.model('User',userSchema);

module.exports = User;

