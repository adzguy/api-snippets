# Download the helper library from https://www.twilio.com/docs/ruby/install
require 'twilio-ruby'

# Your Account Sid and Auth Token from twilio.com/console
# To set up environmental variables, see http://twil.io/secure
account_sid = ENV['TWILIO_ACCOUNT_SID']
auth_token = ENV['TWILIO_AUTH_TOKEN']
@client = Twilio::REST::Client.new(account_sid, auth_token)

incoming_phone_number = @client
  .incoming_phone_numbers('PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')
  .fetch

puts incoming_phone_number.sid
