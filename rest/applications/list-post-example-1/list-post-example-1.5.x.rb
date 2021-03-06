# Get twilio-ruby from twilio.com/docs/ruby/install
require 'twilio-ruby'

# Get your Account SID and Auth Token from twilio.com/console
# To set up environmental variables, see http://twil.io/secure
account_sid = ENV['TWILIO_ACCOUNT_SID']
auth_token = ENV['TWILIO_AUTH_TOKEN']

# Initialize Twilio Client
@client = Twilio::REST::Client.new(account_sid, auth_token)

app = @client.api.v2010.accounts(account_sid).applications.create(
  friendly_name: 'Phone Me',
  voice_url: 'http://demo.twilio.com/docs/voice.xml',
  voice_method: 'GET'
)

puts app.voice_url
